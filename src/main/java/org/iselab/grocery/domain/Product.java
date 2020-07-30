->RefactoringNumber->71441<-IncreaseMethodSecurity(org.iselab.grocery.domain.Product;;[];[setAmount])
->RefactoringNumber->71451<-IncreaseMethodSecurity(org.iselab.grocery.domain.Product;;[];[setId])
->RefactoringNumber->71515<-ExtractClass(org.iselab.grocery.domain.Product;Class_24;[id];[setName])
->RefactoringNumber->71525<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[class_24];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

import org.iselab.grocery.util.UUIDUtils;

public class Product {

    private int id;

    private String name;

    private int amount;

    public Product() {
        this.id = UUIDUtils.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("{");
        builder.append("id: ").append(id).append(", ");
        builder.append("name: \"").append(name).append("\", ");
        builder.append("amount: ").append(amount);
        builder.append("}");
        
        return builder.toString();
    }
}
