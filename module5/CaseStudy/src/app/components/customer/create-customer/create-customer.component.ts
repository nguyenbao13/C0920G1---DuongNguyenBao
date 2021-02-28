import { CustomerService } from './../../../services/customer.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.scss']
})
export class CreateCustomerComponent implements OnInit {
  public formCreateCustomer: FormGroup

  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService
  ) { }

  ngOnInit(): void {
    this.formCreateCustomer = this.formBuilder.group({
      name: [''],
      birthday: [''],
      gender: [''],
      idCard: [''],
      phone: [''],
      email: [''],
      address: [''],
      type: [''],
    })
  }

  createCustomer(){
    this.customerService.createCustomer(this.formCreateCustomer.value).subscribe()
  }
}
