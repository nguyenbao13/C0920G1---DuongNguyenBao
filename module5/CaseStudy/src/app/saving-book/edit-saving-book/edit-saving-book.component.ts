import { SavingBookService } from './../../services/saving-book.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-saving-book',
  templateUrl: './edit-saving-book.component.html',
  styleUrls: ['./edit-saving-book.component.scss']
})
export class EditSavingBookComponent implements OnInit {
  public formEditSavingBook: FormGroup;
  public id;
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);

  constructor(
    public formBuilder: FormBuilder,
    public savingBookService: SavingBookService,
    public activatedRoute: ActivatedRoute,
  ) { }

  ngOnInit(): void {
    this.formEditSavingBook = this.formBuilder.group({
      interest: ['', [Validators.required]],
      bonus: ['', [Validators.required]],
      nameCustomer: ['', [Validators.required, ]],
      openDate: ['', [Validators.required]],
      startDate: ['', [Validators.required]],
      term: ['', [Validators.required]],
      amount: ['', [Validators.required]],
      
    })

    this.activatedRoute.params.subscribe(data => {
      this.id = data.id;
      this.savingBookService.getSavingBookById(this.id).subscribe(data => {
        this.formEditSavingBook.patchValue(data);
      })
    })
  }

  editSavingBook(){
    this.savingBookService.editSavingBook(this.formEditSavingBook.value, this.id).subscribe();
  }
}
