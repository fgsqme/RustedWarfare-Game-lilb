/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface LogicBoolean$Parameter {
    public LogicBoolean$ReturnType type() default LogicBoolean$ReturnType.undefined;

    public boolean required() default false;

    public int positional() default -1;

    public String key() default "";
}

