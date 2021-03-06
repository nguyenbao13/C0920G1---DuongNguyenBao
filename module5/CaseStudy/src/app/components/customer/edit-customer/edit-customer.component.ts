import { Component, OnInit } from '@angular/core';
import { CustomerService } from './../../../services/customer.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.scss']
})
export class EditCustomerComponent implements OnInit {
  public formEditCustomer: FormGroup;
  public customerId;
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);

  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public activatedRoute: ActivatedRoute,
  ) { }

  ngOnInit(): void {
    this.formEditCustomer = this.formBuilder.group({
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      phone: ['', [Validators.required, Validators.pattern('^(0|\\(84\\)\\+)9[01][0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      type: ['', [Validators.required]],
    })

    this.activatedRoute.params.subscribe(data => {
      this.customerId = data.id;
      this.customerService.getCustomerById(this.customerId).subscribe(data => {
        this.formEditCustomer.patchValue(data);
      })
    })
  }

  editCustomer(){
    this.customerService.editCustomer(this.formEditCustomer.value, this.customerId).subscribe(data => {
        
    });
  }
}
