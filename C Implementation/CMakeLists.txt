cmake_minimum_required(VERSION 3.29)
project(C_Implementation C)

set(CMAKE_C_STANDARD 11)

include_directories(LIst)

add_executable(C_Implementation
    LIst/List.c
    LIst/Node.h)
