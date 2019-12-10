import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
  name: 'timeSlot'
})
export class TimeSlotPipe implements PipeTransform {

  transform(value: string): string {
    if (value == "Slot1") {
      return "11:00-13:00";
    } else if (value == "Slot2") {
      return "14:00-16:00";
    } else {
      return "17:00-19:00";
    }
  }

}
