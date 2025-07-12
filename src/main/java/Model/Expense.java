package Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class Expense {
    private long id;
    private String description;
    private Double amount;
    private String type; // "Income" or "Expense"
    private LocalDate date;

    public Expense(String description, Double amount, String type, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }



}
