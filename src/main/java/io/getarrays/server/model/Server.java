package io.getarrays.server.model;

import io.getarrays.server.enumuration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true) // это занчит, что у нас не может быть 2 одинаковых ip адреса
    @NotEmpty(message = "IP Address cannot be empty") // выводим сообщение , если поле оказаолось пустым
    private String ipAddress;

    private String name;
    private String memory;

    private String type;
    private String imageUrl;
    private Status status;
}
