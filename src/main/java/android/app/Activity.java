/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package android.app;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.KeyEvent$Callback;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class Activity
extends ContextWrapper
implements ComponentCallbacks2,
KeyEvent$Callback,
LayoutInflater.Factory2,
View.OnCreateContextMenuListener,
Window.Callback {
    public Activity() {
        super(null);
    }

    public View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int n2) {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onActionModeFinished(ActionMode actionMode) {
    }

    public void onActionModeStarted(ActionMode actionMode) {
    }

    public void onAttachedToWindow() {
    }

    public void onContentChanged() {
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        return false;
    }

    public View onCreatePanelView(int n2) {
        return null;
    }

    public void onDetachedFromWindow() {
    }

    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        return false;
    }

    public boolean onMenuOpened(int n2, Menu menu) {
        return false;
    }

    public void onPanelClosed(int n2, Menu menu) {
    }

    public boolean onPreparePanel(int n2, View view, Menu menu) {
        return false;
    }

    public boolean onSearchRequested() {
        return false;
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
    }

    public void onWindowFocusChanged(boolean bl2) {
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public View onCreateView(View view, String string2, Context context, AttributeSet attributeSet) {
        return null;
    }

    public void a(Intent intent, int n2) {
        this.a(intent, n2, null);
    }

    public void a(Intent intent, int n2, Bundle bundle) {
    }

    public Window a() {
        return null;
    }

    @Deprecated
    public final void a(int n2) {
        this.a(n2, null);
    }

    @Deprecated
    public final boolean a(int n2, Bundle bundle) {
        return true;
    }

    @Deprecated
    public final void b(int n2) {
    }

    public void b() {
    }

    public boolean c() {
        return false;
    }

    public void a(int n2, int n3) {
    }

    public boolean a(Menu menu) {
        return true;
    }
}

