package bll.validators;

/**
 * @Author: Blajan George-Paul
 *
 */
public interface Validator<T> {

    int validate(T t);
}
