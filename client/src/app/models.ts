export interface Recipe{
  label: string;
  imageUrl: string;
  servings: number;
  totalTime: number;
  calories: number;
  caloriesPerServings: number;
  ingredients: Ingredients[]
  source: string
  url: string
}

export class User {
  constructor(
    public name: string,
    public email: string,
    public password: string
  ) {}
}

export interface Message {
  message: string;
}

export interface Ingredients {
  quantity: number;
  measure: string;
  foodId: string;
  imageUrl: string;
  food: string;
}


export interface UserInfo {
  name: string;
  email: string;
  lineItem: LineItem[];
  recipesList: Recipe[];
}

export interface UserInfoResponse {
  name: string;
  email: string;
  lineItem: LineItem[];
  recipesList: Recipe[];
  token: string;
}

export interface LineItem {
  name: string;
  quantity: number;

}
