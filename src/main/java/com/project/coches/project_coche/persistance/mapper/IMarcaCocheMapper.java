package com.project.coches.project_coche.persistance.mapper;


import com.project.coches.project_coche.domain.pojo.MarcaCochePojo;
import com.project.coches.project_coche.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


/**
 * *mapper que tranforma objetos de marcacoche p pojos a entidad
 */

@Mapper(componentModel="string")
public interface IMarcaCocheMapper {

    /**
     * convierte ina entidad a pojo de marca coche
     * @param marcaEntity entidad a convertit
     * @return pojo convertido
     */
    @Mapping(source = "id",target ="id")
    @Mapping(source = "description",target ="description")

    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);
    /**
     * convierte ina pojo a entidad de marca coche
     * @param marcaPojo pojo a convertit
     * @return pojo convertido
     */
    @InheritConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaPojo);

    /**
     * retorna una lista de marcas cochr transformadas a pojo de una lista de entidades
     * @param marcaCocheEntity edtidad a transforma
     * @return lista transformada
     */
   /** List<MarcaCochePojo> toMarcaCochePojo(list<MarcaCocheEntity> marcaCocheEntity) ;**/

}
