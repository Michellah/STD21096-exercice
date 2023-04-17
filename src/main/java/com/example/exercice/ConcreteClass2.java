package com.example.exercice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1{
  @Autowired
  public ConcreteClass2(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2){
        this.concreteDependance1 = concreteDependance1;
        this.concreteDependance2 = concreteDependance2;
  }
}
