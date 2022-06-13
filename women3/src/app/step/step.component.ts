import { Component, OnInit } from '@angular/core';


import { FormGroup, FormBuilder , Validators } from '@angular/forms';
import { AuthenticationService } from '../authentication.service';
import { Router } from '@angular/router';
import { User } from '../user';

@Component({
  selector: 'app-step',
  templateUrl: './step.component.html',
  styleUrls: ['./step.component.css']
})
export class StepComponent implements OnInit {

  registerForm: FormGroup | any;
  submitted = false;
 

  constructor(private formBuilder: FormBuilder,
    private userService: AuthenticationService,
    private router: Router) { }

  ngOnInit(): void {

    this.registerForm = this.formBuilder.group({
      fname: ['',[ Validators.required,Validators.pattern('^[a-zA-Z]+$')]],
      lname: ['',[ Validators.required,Validators.pattern('^[a-zA-Z]+$')]],
      fathername: ['', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]],
      mothername: ['', [Validators.required, Validators.pattern('^[a-zA-Z]+$')]],
      phonenumber: ['', [Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      aadharcardnumber:  ['', [Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      trainingcourse:  ['', [Validators.required]],});
  }
}