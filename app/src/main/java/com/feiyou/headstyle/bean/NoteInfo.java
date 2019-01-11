package com.feiyou.headstyle.bean;

import java.util.List;

/**
 * Created by myflying on 2018/11/27.
 */
public class NoteInfo{

    private String id;
    private String noteTitle;
    private List<HeadInfo> heads;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public List<HeadInfo> getHeads() {
        return heads;
    }

    public void setHeads(List<HeadInfo> heads) {
        this.heads = heads;
    }
}
