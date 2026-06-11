package com.cognizant.MVC;

public class Controller {
     View view;
     Model model;
     public Controller(View view,Model model){
         this.view=view;
         this.model=model;
     }
     public void display(){
         view.show(model.name);
     }

}
