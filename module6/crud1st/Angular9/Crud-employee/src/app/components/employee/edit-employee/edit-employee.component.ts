import { EmployeeService } from './../../../services/employee.service';
import { FormBuilder } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.scss']
})
export class EditEmployeeComponent implements OnInit {
  public formEditEmployee;
  public employeeId;

  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formEditEmployee = this.formBuilder.group({
      employeeName: ['']
    })

    this.activatedRoute.params.subscribe(data => {
      this.employeeId = data.employeeId;
      this.employeeService.getEmployeeById(this.employeeId).subscribe(haha => {
        this.formEditEmployee.patchValue(data);
      })
    })
  }

  editEmployee() {
    this.employeeService.editEmployee(this.formEditEmployee.value, this.employeeId).subscribe()
  }
}
