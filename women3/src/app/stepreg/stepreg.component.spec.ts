import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StepregComponent } from './stepreg.component';

describe('StepregComponent', () => {
  let component: StepregComponent;
  let fixture: ComponentFixture<StepregComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StepregComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StepregComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
