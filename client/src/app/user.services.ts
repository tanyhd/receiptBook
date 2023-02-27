import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { lastValueFrom } from "rxjs";
import { User, UserInfo } from "./models";
import { HttpHeaders } from '@angular/common/http';

@Injectable()
export class UserService {
  constructor(private http: HttpClient) {}

  addNewUser(user: User) {
    return (lastValueFrom(
      this.http.post<any>("https://recipe-book-be-production.up.railway.app/api/v1/auth/register", user)
    ))
  }

  userLogin(email: string, password: string) {
    return (lastValueFrom(
      this.http.post<any>("https://recipe-book-be-production.up.railway.app/api/v1/auth/authenticate", {"email": email, "password" : password})
    ))
  }

  updateUser(userInfo: UserInfo, token: string) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Authorization': `Bearer ${token}`
      })
    };
    return (lastValueFrom(
      this.http.post<any>("https://recipe-book-be-production.up.railway.app/api/v1/user/update", userInfo, httpOptions)
    ))
  }
}
