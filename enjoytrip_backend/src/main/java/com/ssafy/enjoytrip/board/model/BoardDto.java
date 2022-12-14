package com.ssafy.enjoytrip.board.model;

import java.util.List;

public class BoardDto {
    private int articleNo;
    private String userId;
    private String title;
    private String content;
    private int hit;
    private String registDate;
    private int isNotice;
    private List<BoardFileInfoDto> fileInfos;

    public int getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(int articleNo) {
        this.articleNo = articleNo;
    }
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setWriter(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    public int getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(int isNotice) {
        this.isNotice = isNotice;
    }
    
	public List<BoardFileInfoDto> getFileInfos() {
		return fileInfos;
	}

	public void setFileInfos(List<BoardFileInfoDto> fileInfos) {
		this.fileInfos = fileInfos;
	}

	@Override
	public String toString() {
		return "BoardDto [articleNo=" + articleNo + ", userId=" + userId + ", title=" + title + ", content=" + content
				+ ", hit=" + hit + ", registDate=" + registDate + ", isNotice=" + isNotice
				+ "]";
	}
	
	
}
