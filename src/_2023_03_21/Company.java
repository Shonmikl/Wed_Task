package _2023_03_21;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Company {
    private String name;
    List<Department> departmentList;
}