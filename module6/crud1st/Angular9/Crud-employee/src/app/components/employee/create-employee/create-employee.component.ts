import { Router } from '@angular/router';
import { EmployeeService } from './../../../services/employee.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.scss']
})
export class CreateEmployeeComponent implements OnInit {
  public formCreateEmployee: FormGroup;

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
  ) { }

  ngOnInit(): void {
    this.formCreateEmployee = this.formBuilder.group({
      employeeName: [''],
    })
  }

  createEmployee() {
    this.employeeService.createEmployee(this.formCreateEmployee.value).subscribe(data => {
      this.router.navigateByUrl('employee');
    });
  }
}
