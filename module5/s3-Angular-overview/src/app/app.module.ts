import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontSizeEditorComponent } from './Thuc_hanh/font-size-editor/font-size-editor.component';
import { PetComponent } from './Thuc_hanh/pet/pet.component';
import { CalculatorComponent } from './Bai_tap/calculator/calculator.component';
import { ColorPickerComponent } from './Bai_tap/color-picker/color-picker.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    FontSizeEditorComponent,
    PetComponent,
    CalculatorComponent,
    ColorPickerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
