package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;

final class MessageLiteToString {
   private static final String LIST_SUFFIX = "List";
   private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
   private static final String MAP_SUFFIX = "Map";
   private static final String BYTES_SUFFIX = "Bytes";

   static String toString(MessageLite var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("# ").append(var1);
      reflectivePrintWithIndent(var0, var2, 0);
      return var2.toString();
   }

   private static void reflectivePrintWithIndent(MessageLite var0, StringBuilder var1, int var2) {
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      TreeSet var5 = new TreeSet();
      Method[] var6 = var0.getClass().getDeclaredMethods();
      int var7 = var6.length;

      Method var9;
      for(int var8 = 0; var8 < var7; ++var8) {
         var9 = var6[var8];
         var4.put(var9.getName(), var9);
         if (var9.getParameterTypes().length == 0) {
            var3.put(var9.getName(), var9);
            if (var9.getName().startsWith("get")) {
               var5.add(var9.getName());
            }
         }
      }

      Iterator var15 = var5.iterator();

      while(true) {
         while(var15.hasNext()) {
            String var16 = (String)var15.next();
            String var18 = var16.replaceFirst("get", "");
            Method var10;
            String var19;
            if (var18.endsWith("List") && !var18.endsWith("OrBuilderList") && !var18.equals("List")) {
               var19 = var18.substring(0, 1).toLowerCase() + var18.substring(1, var18.length() - "List".length());
               var10 = (Method)var3.get(var16);
               if (var10 != null && var10.getReturnType().equals(List.class)) {
                  printField(var1, var2, camelCaseToSnakeCase(var19), GeneratedMessageLite.invokeOrDie(var10, var0));
                  continue;
               }
            }

            if (var18.endsWith("Map") && !var18.equals("Map")) {
               var19 = var18.substring(0, 1).toLowerCase() + var18.substring(1, var18.length() - "Map".length());
               var10 = (Method)var3.get(var16);
               if (var10 != null && var10.getReturnType().equals(Map.class) && !var10.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(var10.getModifiers())) {
                  printField(var1, var2, camelCaseToSnakeCase(var19), GeneratedMessageLite.invokeOrDie(var10, var0));
                  continue;
               }
            }

            var9 = (Method)var4.get("set" + var18);
            if (var9 != null && (!var18.endsWith("Bytes") || !var3.containsKey("get" + var18.substring(0, var18.length() - "Bytes".length())))) {
               String var20 = var18.substring(0, 1).toLowerCase() + var18.substring(1);
               Method var11 = (Method)var3.get("get" + var18);
               Method var12 = (Method)var3.get("has" + var18);
               if (var11 != null) {
                  Object var13 = GeneratedMessageLite.invokeOrDie(var11, var0);
                  boolean var14 = var12 == null ? !isDefaultValue(var13) : (Boolean)GeneratedMessageLite.invokeOrDie(var12, var0);
                  if (var14) {
                     printField(var1, var2, camelCaseToSnakeCase(var20), var13);
                  }
               }
            }
         }

         if (var0 instanceof GeneratedMessageLite.ExtendableMessage) {
            var15 = ((GeneratedMessageLite.ExtendableMessage)var0).extensions.iterator();

            while(var15.hasNext()) {
               Entry var17 = (Entry)var15.next();
               printField(var1, var2, "[" + ((GeneratedMessageLite.ExtensionDescriptor)var17.getKey()).getNumber() + "]", var17.getValue());
            }
         }

         if (((GeneratedMessageLite)var0).unknownFields != null) {
            ((GeneratedMessageLite)var0).unknownFields.printWithIndent(var1, var2);
         }

         return;
      }
   }

   private static boolean isDefaultValue(Object var0) {
      if (var0 instanceof Boolean) {
         return !(Boolean)var0;
      } else if (var0 instanceof Integer) {
         return (Integer)var0 == 0;
      } else if (var0 instanceof Float) {
         return (Float)var0 == 0.0F;
      } else if (var0 instanceof Double) {
         return (Double)var0 == 0.0D;
      } else if (var0 instanceof String) {
         return var0.equals("");
      } else if (var0 instanceof ByteString) {
         return var0.equals(ByteString.EMPTY);
      } else if (var0 instanceof MessageLite) {
         return var0 == ((MessageLite)var0).getDefaultInstanceForType();
      } else if (var0 instanceof Enum) {
         return ((Enum)var0).ordinal() == 0;
      } else {
         return false;
      }
   }

   static final void printField(StringBuilder var0, int var1, String var2, Object var3) {
      Iterator var9;
      if (var3 instanceof List) {
         List var10 = (List)var3;
         var9 = var10.iterator();

         while(var9.hasNext()) {
            Object var11 = var9.next();
            printField(var0, var1, var2, var11);
         }

      } else if (var3 instanceof Map) {
         Map var8 = (Map)var3;
         var9 = var8.entrySet().iterator();

         while(var9.hasNext()) {
            Entry var6 = (Entry)var9.next();
            printField(var0, var1, var2, var6);
         }

      } else {
         var0.append('\n');

         int var4;
         for(var4 = 0; var4 < var1; ++var4) {
            var0.append(' ');
         }

         var0.append(var2);
         if (var3 instanceof String) {
            var0.append(": \"").append(TextFormatEscaper.escapeText((String)var3)).append('"');
         } else if (var3 instanceof ByteString) {
            var0.append(": \"").append(TextFormatEscaper.escapeBytes((ByteString)var3)).append('"');
         } else if (var3 instanceof GeneratedMessageLite) {
            var0.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite)var3, var0, var1 + 2);
            var0.append("\n");

            for(var4 = 0; var4 < var1; ++var4) {
               var0.append(' ');
            }

            var0.append("}");
         } else if (var3 instanceof Entry) {
            var0.append(" {");
            Entry var7 = (Entry)var3;
            printField(var0, var1 + 2, "key", var7.getKey());
            printField(var0, var1 + 2, "value", var7.getValue());
            var0.append("\n");

            for(int var5 = 0; var5 < var1; ++var5) {
               var0.append(' ');
            }

            var0.append("}");
         } else {
            var0.append(": ").append(var3.toString());
         }

      }
   }

   private static final String camelCaseToSnakeCase(String var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         if (Character.isUpperCase(var3)) {
            var1.append("_");
         }

         var1.append(Character.toLowerCase(var3));
      }

      return var1.toString();
   }
}
