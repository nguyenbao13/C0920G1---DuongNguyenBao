import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateCustomerComponent } from './components/customer/create-customer/create-customer.component';
import { CreateEmployeeComponent } from './components/employee/create-employee/create-employee.component';
import { CreateServiceComponent } from './components/service/create-service/create-service.component';
import { CreateContractComponent } from './components/contract/create-contract/create-contract.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateCustomerComponent,
    CreateEmployeeComponent,
    CreateServiceComponent,
    CreateContractComponent,
    CustomerListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
