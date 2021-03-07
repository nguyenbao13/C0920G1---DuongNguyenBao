import { DeleteEmployeeComponent } from './components/employee/delete-employee/delete-employee.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatDialogModule } from '@angular/material/dialog';



@NgModule({
  declarations: [],
  imports: [
    // MatDatepickerModule,
    // MatFormFieldModule,
    // MatNativeDateModule,
    // MatInputModule,
    // BrowserAnimationsModule,
    CommonModule,
    MatDialogModule
  ],
  exports: [
    // MatDatepickerModule,
    // MatFormFieldModule,
    // MatNativeDateModule,
    // MatInputModule,
    // BrowserAnimationsModule,
    MatDialogModule
  ],
  // providers: [MatDatepickerModule],
  entryComponents: [DeleteEmployeeComponent]
})
export class MaterialModule { }
