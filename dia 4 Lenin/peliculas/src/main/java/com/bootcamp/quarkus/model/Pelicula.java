package com.bootcamp.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="pelicula")
public class Pelicula extends PanacheEntity{

    private String name;
    private String icdn;
    @Column(name ="created_date", nullable = false)
    private Instant createdDate = Instant.now();
            public Pelicula(String name,String icdn){
               this.name = name ;
               this.icdn = icdn ;
                  }


}
