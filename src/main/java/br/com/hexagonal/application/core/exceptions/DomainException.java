package br.com.hexagonal.application.core.exceptions;

@SuppressWarnings("serial")
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

    public static class NotFoundException extends DomainException {

        public NotFoundException() {
            super("Formulário não encontrado!");
        }

        public NotFoundException(String message) {
            super(message);
        }
    }

    public static class ExistingException extends DomainException {

        public ExistingException() {
            super("Este formulário já existe!");
        }

        public ExistingException(String message) {
            super(message);
        }
    }
}

