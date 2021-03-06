import { SavingBookService } from './../../services/saving-book.service';
import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
@Component({
  selector: 'app-list-saving-book',
  templateUrl: './list-saving-book.component.html',
  styleUrls: ['./list-saving-book.component.scss']
})
export class ListSavingBookComponent implements OnInit {
  public savingBooks;
  public p: number = 1;

  constructor(
    public savingBookService: SavingBookService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.savingBookService.getAllSavingBooks().subscribe(data => {
      this.savingBooks = data;
    })
  }

}
