import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoregComponent } from './ngoreg.component';

describe('NgoregComponent', () => {
  let component: NgoregComponent;
  let fixture: ComponentFixture<NgoregComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoregComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgoregComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
