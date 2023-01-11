import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
      book :any;
   constructor( private service:BookserviceService)
   {
       
   }
   ngOnInit(): void {
    this.book=  this.service.getBooks().subscribe((data)=>this.book=data);
   }
}
