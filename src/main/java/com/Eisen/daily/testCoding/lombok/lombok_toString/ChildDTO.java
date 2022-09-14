package com.Eisen.daily.testCoding.lombok.lombok_toString;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ChildDTO extends ParentDTO {
    private String scream;

}
