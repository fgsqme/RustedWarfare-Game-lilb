/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$ParameterMapping$FieldOrMethod;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class LogicBooleanLoader$ParameterMapping {
    public HashMap parameters = new HashMap();
    int numberOfPositionalParameters = 0;
    public Class type;
    public String allParametersString;

    public LogicBooleanLoader$ParameterMapping(Class clazz) {
        this.type = clazz;
        ArrayList arrayList = new ArrayList();
        LogicBooleanLoader.getAllFieldsInherited((List)arrayList, clazz);
        this.allParametersString = "";
        Method[] methodArray = arrayList.iterator();
        while (methodArray.hasNext()) {
            Method[] methodArray2 = (Method[])methodArray.next();
            if (!methodArray2.isAnnotationPresent(LogicBoolean$Parameter.class)) continue;
            LogicBoolean$Parameter logicBoolean$Parameter = (LogicBoolean$Parameter)methodArray2.getAnnotation(LogicBoolean$Parameter.class);
            String string2 = methodArray2.getName().toLowerCase(Locale.ROOT);
            this.addParameter(string2, new LogicBooleanLoader$ParameterMapping$FieldOrMethod((Field)methodArray2), logicBoolean$Parameter);
        }
        for (Method method : methodArray = clazz.getMethods()) {
            if (!method.isAnnotationPresent(LogicBoolean$Parameter.class)) continue;
            LogicBoolean$Parameter logicBoolean$Parameter = (LogicBoolean$Parameter)method.getAnnotation(LogicBoolean$Parameter.class);
            String string3 = method.getName().toLowerCase(Locale.ROOT);
            this.addParameter(string3, new LogicBooleanLoader$ParameterMapping$FieldOrMethod(method), logicBoolean$Parameter);
        }
    }

    public void addParameter(String string2, LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod, LogicBoolean$Parameter logicBoolean$Parameter) {
        if (logicBoolean$Parameter.type() != LogicBoolean$ReturnType.undefined) {
            logicBooleanLoader$ParameterMapping$FieldOrMethod.returnType = logicBoolean$Parameter.type();
        }
        if (logicBoolean$Parameter.positional() != -1) {
            logicBooleanLoader$ParameterMapping$FieldOrMethod.positionalOffset = logicBoolean$Parameter.positional();
            ++this.numberOfPositionalParameters;
        }
        if (logicBoolean$Parameter.required()) {
            logicBooleanLoader$ParameterMapping$FieldOrMethod.required = true;
        }
        if (logicBoolean$Parameter.key() != null && !logicBoolean$Parameter.key().equals((Object)"")) {
            string2 = logicBoolean$Parameter.key();
        }
        this.parameters.put((Object)string2, (Object)logicBooleanLoader$ParameterMapping$FieldOrMethod);
        if (!this.allParametersString.equals((Object)"")) {
            this.allParametersString = this.allParametersString + ", ";
        }
        this.allParametersString = this.allParametersString + string2;
    }
}

