/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package android.os;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;

final class Message$1
implements Parcelable.Creator {
    Message$1() {
    }

    public Message a(Parcel parcel) {
        Message message = Message.a();
        Message.a(message, parcel);
        return message;
    }

    public Message[] a(int n2) {
        return new Message[n2];
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

