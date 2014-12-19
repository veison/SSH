package com.veison.dao;

import java.io.Serializable;

public interface UserDaoI<T> {
  public Serializable save(T o);
}
