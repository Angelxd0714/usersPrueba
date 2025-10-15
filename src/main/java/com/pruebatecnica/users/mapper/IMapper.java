package com.pruebatecnica.users.mapper;

public interface IMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
}
