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
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      phone: ['', [Validators.required, Validators.pattern('^(0|\\(84\\)\\+)9[01][0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      type: ['', [Validators.required]],
    })
  }

  createCustomer(){
    this.customerService.createCustomer(this.formCreateCustomer.value).subscribe()
  }
}
