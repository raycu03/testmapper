package com.mapper.testmapper.mapperTest;

import com.mapper.testmapper.controller.Perro;
import com.mapper.testmapper.controller.Perro.PerroBuilder;
import com.mapper.testmapper.controller.PerroDto;
import com.mapper.testmapper.controller.PerroDto.PerroDtoBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-15T02:22:50-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class MapperTestImpl implements MapperTest {

    @Override
    public Perro toEntity(PerroDto perroDto) {
        if ( perroDto == null ) {
            return null;
        }

        PerroBuilder perro = Perro.builder();

        perro.name( perroDto.getName() );

        return perro.build();
    }

    @Override
    public PerroDto toRest(Perro perro) {
        if ( perro == null ) {
            return null;
        }

        PerroDtoBuilder perroDto = PerroDto.builder();

        perroDto.name( perro.getName() );

        return perroDto.build();
    }
}
