import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {AuthenticationService} from './_services/authentication.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public href = '';

  constructor(private router: Router, private auth: AuthenticationService) {
  }


  show() {
    this.href = '' + this.router.url;
    return !(this.href === '/login');
  }

  logout() {
    this.auth.logout();
    this.router.navigateByUrl('/login');
  }
}
