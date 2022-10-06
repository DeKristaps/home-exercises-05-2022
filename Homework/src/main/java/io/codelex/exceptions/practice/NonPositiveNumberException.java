package io.codelex.exceptions.practice;

    class NonPositiveNumberException extends NumberFormatException{
        public NonPositiveNumberException(String string){
            super(string);
        }
    }