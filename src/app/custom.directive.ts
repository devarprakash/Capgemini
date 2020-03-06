import { Directive } from '@angular/core';
import {ElementRef,HostListener} from '@angular/core';
@Directive({
  selector: '[CustomDirective]'
})
export class CustomDirective {

  constructor(private el:ElementRef) { }

  @HostListener('mouseenter') onMouseEnter()
{
  this.focusColor("green");
}
@HostListener('mouseleave') onMouseLeave()
{
  this.focusColor("yellow");
}

public focusColor(color)
{
  this.el.nativeElement.style.backgroundColor=color;
}
}

