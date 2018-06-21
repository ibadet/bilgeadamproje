package com.fazlaysapaylas.utils;

import java.io.Serializable;

public abstract class ABaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public abstract Long getIdentifier();
}