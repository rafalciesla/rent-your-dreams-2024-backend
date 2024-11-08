package pl.ciesla.ryd.cars.mapper

import org.mapstruct.Mapper
import pl.ciesla.ryd.cars.model.User
import pl.ciesla.ryd.cars.web.dto.UserDTO
import pl.ciesla.ryd.lib.mapper.RYDMapper

@Mapper(componentModel = "spring")
interface UserMapper : RYDMapper<User, UserDTO> {
}