package com.example.db.entities;

import com.example.db.entities.types.TypeName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Column implements Serializable {
    private String name;
    private TypeName type;
}
