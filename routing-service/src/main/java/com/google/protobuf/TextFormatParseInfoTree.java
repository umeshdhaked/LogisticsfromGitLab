package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TextFormatParseInfoTree {
   private Map locationsFromField;
   Map subtreesFromField;

   private TextFormatParseInfoTree(Map var1, Map var2) {
      HashMap var3 = new HashMap();
      Iterator var4 = var1.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var3.put(var5.getKey(), Collections.unmodifiableList((List)var5.getValue()));
      }

      this.locationsFromField = Collections.unmodifiableMap(var3);
      HashMap var10 = new HashMap();
      Iterator var11 = var2.entrySet().iterator();

      while(var11.hasNext()) {
         Entry var6 = (Entry)var11.next();
         ArrayList var7 = new ArrayList();
         Iterator var8 = ((List)var6.getValue()).iterator();

         while(var8.hasNext()) {
            TextFormatParseInfoTree.Builder var9 = (TextFormatParseInfoTree.Builder)var8.next();
            var7.add(var9.build());
         }

         var10.put(var6.getKey(), Collections.unmodifiableList(var7));
      }

      this.subtreesFromField = Collections.unmodifiableMap(var10);
   }

   public List getLocations(Descriptors.FieldDescriptor var1) {
      List var2 = (List)this.locationsFromField.get(var1);
      return var2 == null ? Collections.emptyList() : var2;
   }

   public TextFormatParseLocation getLocation(Descriptors.FieldDescriptor var1, int var2) {
      return (TextFormatParseLocation)getFromList(this.getLocations(var1), var2, var1);
   }

   public List getNestedTrees(Descriptors.FieldDescriptor var1) {
      List var2 = (List)this.subtreesFromField.get(var1);
      return var2 == null ? Collections.emptyList() : var2;
   }

   public TextFormatParseInfoTree getNestedTree(Descriptors.FieldDescriptor var1, int var2) {
      return (TextFormatParseInfoTree)getFromList(this.getNestedTrees(var1), var2, var1);
   }

   public static TextFormatParseInfoTree.Builder builder() {
      return new TextFormatParseInfoTree.Builder();
   }

   private static Object getFromList(List var0, int var1, Descriptors.FieldDescriptor var2) {
      if (var1 < var0.size() && var1 >= 0) {
         return var0.get(var1);
      } else {
         throw new IllegalArgumentException(String.format("Illegal index field: %s, index %d", var2 == null ? "<null>" : var2.getName(), var1));
      }
   }

   // $FF: synthetic method
   TextFormatParseInfoTree(Map var1, Map var2, Object var3) {
      this(var1, var2);
   }

   public static class Builder {
      private Map locationsFromField;
      private Map subtreeBuildersFromField;

      private Builder() {
         this.locationsFromField = new HashMap();
         this.subtreeBuildersFromField = new HashMap();
      }

      public TextFormatParseInfoTree.Builder setLocation(Descriptors.FieldDescriptor var1, TextFormatParseLocation var2) {
         Object var3 = (List)this.locationsFromField.get(var1);
         if (var3 == null) {
            var3 = new ArrayList();
            this.locationsFromField.put(var1, var3);
         }

         ((List)var3).add(var2);
         return this;
      }

      public TextFormatParseInfoTree.Builder getBuilderForSubMessageField(Descriptors.FieldDescriptor var1) {
         Object var2 = (List)this.subtreeBuildersFromField.get(var1);
         if (var2 == null) {
            var2 = new ArrayList();
            this.subtreeBuildersFromField.put(var1, var2);
         }

         TextFormatParseInfoTree.Builder var3 = new TextFormatParseInfoTree.Builder();
         ((List)var2).add(var3);
         return var3;
      }

      public TextFormatParseInfoTree build() {
         return new TextFormatParseInfoTree(this.locationsFromField, this.subtreeBuildersFromField);
      }

      // $FF: synthetic method
      Builder(Object var1) {
         this();
      }
   }
}
