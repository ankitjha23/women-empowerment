import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { RegisterComponent } from './register/register.component';
import { NgoComponent } from './ngo/ngo.component';
import { StepComponent } from './step/step.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { LegislationsComponent } from './legislations/legislations.component';
import { StepregComponent } from './stepreg/stepreg.component';
import { NgoregComponent } from './ngoreg/ngoreg.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path:'login', component:LoginComponent},
  { path:'logout', component:LogoutComponent},
  { path:'admin', component:AdminComponent},
  { path:'register', component:RegisterComponent},
  { path:'ngo', component:NgoComponent},
  { path:'step', component:StepComponent},
  { path:'contact', component:ContactComponent},
  { path:'home', component:HomeComponent},
  { path:'about', component:AboutComponent},
  { path:'policy', component:LegislationsComponent},
  { path:'stepreg', component:StepregComponent},
  { path:'ngoreg', component:NgoregComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
  export class AppRoutingModule { }
