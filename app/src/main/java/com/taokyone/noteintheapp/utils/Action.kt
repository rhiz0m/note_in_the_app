package com.taokyone.noteintheapp.utils

// Will represent some of the action that will be triggered by our database table.
// We use this to pass our actions from the Task Screen to the List Screen
enum class  Action {
    ADD,
    UPDATE,
    DELETE,
    DELETE_ALL,
    UNDO,
    NO_ACTION
}