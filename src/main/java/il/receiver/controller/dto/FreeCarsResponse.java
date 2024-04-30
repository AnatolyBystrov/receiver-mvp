package il.receiver.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FreeCarsResponse {
    //TODO:: Here we need to understand exactly what's data we will send to client for easy parsing in google maps
    private List<Cars> cards;
}
