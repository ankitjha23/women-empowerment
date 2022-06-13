import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { AuthenticationService } from '../authentication.service';
import { Router } from '@angular/router';
import { Validators } from '@angular/forms';
import { NgClass } from '@angular/common';
import { UserDetails } from '../user-details';

@Component({
  selector: 'app-stepreg',
  templateUrl: './stepreg.component.html',
  styleUrls: ['./stepreg.component.css']
})
export class StepregComponent implements OnInit {

  registerForm: FormGroup | any;
  submitted = false;
 
 
  user1: UserDetails = new UserDetails();

  constructor(private formBuilder: FormBuilder,
    private userService: AuthenticationService,
    private router: Router) { }

  ngOnInit(): void {

    this.registerForm = this.formBuilder.group({
      username: ['',[ Validators.required,Validators.pattern('^[a-zA-Z]+$')]],
      lname: ['',[ Validators.required,Validators.pattern('^[a-zA-Z]+$')]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      dob: ['', [Validators.required]],
      number:  ['', [Validators.required]],
      street:  ['', [Validators.required]],
      city:  ['', [Validators.required]],
      pincode:  ['', [Validators.required]],});
  }

  get f() { return this.registerForm.controls; }
 
  changeCity(e: | any) {
    this.registerForm.get('city').setValue(e.target.value, {
     onlySelf: true
    })
  }

  UserAddress(): void {
    this.submitted = false;
    this.user1= new UserDetails();
  }

  
  onSubmit() {
    //alert("welcome");
    this.submitted = true;
    this.user1=this.registerForm.value;
    // stop the process here if form is invalid
  /*  if (this.registerForm.invalid) {
        return;
    }*/
    //alert("hello");
    this.save();
  }

  save() {
    //alert("ts");
    alert(this.user1.fname);
    this.userService.saveUserStep(this.user1)
    .subscribe(data => console.log(data), error => console.log(error));
    this.user1= new UserDetails();
    // this.address=new Address();

    this.gotoList();
  }

  gotoList() {
    this.router.navigate(['/login']);
  }

}
