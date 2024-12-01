import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResponsablerhComponent } from './responsablerh.component';

describe('ResponsablerhComponent', () => {
  let component: ResponsablerhComponent;
  let fixture: ComponentFixture<ResponsablerhComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ResponsablerhComponent]
    });
    fixture = TestBed.createComponent(ResponsablerhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
