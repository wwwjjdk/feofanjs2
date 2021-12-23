package com.company;

public class Worker {
  private  OnTaskDoneListener callback;
  private  OnTaskErrorListener error;

  public Worker(OnTaskDoneListener callback, OnTaskErrorListener error){
      this.callback = callback;
      this.error = error;
  }

  public void start(){
      for(int i = 0; i <100; i++){
          if(i == 33){
              error.notDone("ошибка");
          }else{
              callback.onDone("Task " + i + " is done");
          }

      }
  }
}
