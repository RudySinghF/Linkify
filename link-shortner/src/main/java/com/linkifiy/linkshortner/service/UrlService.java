package com.linkifiy.linkshortner.service;

import com.linkifiy.linkshortner.model.Url;
import com.linkifiy.linkshortner.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);
}
