YUI.add("aui-image-viewer-gallery",function(e,t){var n=e.Lang,r=n.isBoolean,i=n.isNumber,s=n.isObject,o=n.isString,u="autoPlay",a="body",f="content",l="currentIndex",c="delay",h=".",p="entry",d="handler",v="hidden",m="href",g="icon",y="image-gallery",b="img",w="left",E="links",S="offset",x="offsetWidth",T="page",N="pagination",C="paginationEl",k="paginationInstance",L="pause",A="paused",O="pausedLabel",M="play",_="player",D="playing",P="playingLabel",H="px",B="repeat",j="showPlayer",F=" ",I="src",q="thumb",R="toolbar",U="total",z="useOriginalImage",W="viewportRegion",X="visible",V="well",$=function(){return Array.prototype.slice.call(arguments).join(F)},J=e.getClassName,K=J(g,L),Q=J(g,M),G=J(y,N),Y=J(y,N,q),Z=J(y,_),et=J(y,_,f),tt=J(V),nt="(playing)",rt='<div class="'+G+'"></div>',it='<li><a class="'+$(Y,tt)+'"><img src="{src}" /></a></li>',st='<div class="'+Z+'"></div>',ot='<span class="'+et+'"></span>',ut=e.Component.create({NAME:y,ATTRS:{autoPlay:{value:!1,validator:r},delay:{value:7e3,validator:i},pagination:{value:{},setter:function(t){var n=this;return e.merge({formatter:e.bind(n._thumbnailFormatter,n),after:{changeRequest:function(e){n.fire("changeRequest",{lastState:e.lastState,state:e.state})}},render:n.get(C),showControls:!1},t)},validator:s},paginationEl:{readyOnly:!0,valueFn:function(){return e.Node.create(rt)}},paginationInstance:{value:null},paused:{value:!1,validator:r},pausedLabel:{value:"",validator:o},playing:{value:!1,validator:r},playingLabel:{value:nt,validator:o},repeat:{value:!0,validator:r},showPlayer:{value:!0,validator:r},toolbar:{value:{},setter:"_setToolbar",validator:s},useOriginalImage:{value:!1,validator:r}},EXTENDS:e.ImageViewer,prototype:{toolbar:null,_timer:null,renderUI:function(){var e=this;ut.superclass.renderUI.apply(this,arguments),e._renderPagination(),e.get(j)&&e._renderPlayer()},bindUI:function(){var e=this;ut.superclass.bindUI.apply(this,arguments),e.on("playingChange",e._onPlayingChange),e.on("pausedChange",e._onPausedChange),e.on("currentIndexChange",e._onCurrentIndexChange),e.publish("changeRequest",{defaultFn:this._changeRequest})},destroy:function(){var e=this;ut.superclass.destroy.apply(this,arguments),e.get(k).destroy(),e.toolbar.destroy()},hidePagination:function(){var e=this;e.get(C).hide()},pause:function(){var e=this;e.set(A,!0),e.set(D,!1),e._syncInfoUI()},play:function(){var e=this;e.set(A,!1),e.set(D,!0),e._syncInfoUI()},show:function(){var t=this,n=t.getCurrentLink();if(n){e.ImageViewer.superclass.show.apply(this,arguments);var r=t.get(k);r._dispatchRequest({page:t.get(l)+1})}},showPagination:function(){var e=this;e.get(C).show()},_cancelTimer:function(){var e=this;e._timer&&e._timer.cancel()},_renderPagination:function(){var t=this,n=t.get(C);e.one(a).append(n.hide());var r=(new e.Pagination(t.get(N))).render();t.set(k,r)},_renderPlayer:function(){var t=this,n=t.get(C),r=e.Node.create(ot);n.append(e.Node.create(st).append(r)),t.toolbar=(new e.Toolbar(t.get(R))).render(r)},_setToolbar:function(t){var n=this;return n.get(j)&&(t=e.merge({children:[[{icon:Q,on:{click:e.bind(n.play,n)}},{icon:K,on:{click:e.bind(n.pause,n)}}]]},t)),t},_startTimer:function(){var t=this,n=t.get(c);t._cancelTimer(),t._timer=e.later(n,t,t._syncSlideShow)},_syncControlsUI:function(){var e=this;ut.superclass._syncControlsUI.apply(this,arguments),e.get(X)?e.showPagination():(e.hidePagination(),e._cancelTimer())},_syncSlideShow:function(){var e=this;e.hasNext()||(e.get(B)?e.set(l,-1):e._cancelTimer()),e.next()},_changeRequest:function(e){var t=this,n=e.state,r=e.lastState,i=n.page;if(!t.get(X))return!1;if(!r||r&&r.page!=i)t.set(l,i-1),t._processChangeRequest();var s=t.get(E).size(),o=t.get(k),u=o.get(U);if(s>u){var a=parseInt(i/u,10)*u+1;i%u===0&&(a-=u),i=i%u||u,o.set(S,a),o.setState({page:i})}},_processChangeRequest:function(){var e=this;e.loadImage(e.getCurrentLink().attr(m));var t=e.get(A),n=e.get(D);n&&!t&&e._startTimer()},_thumbnailFormatter:function(e){var t=this,r=t.get(k),i=t.get(E).size(),s=e-1;if(e>i)return"";var o=t.getLink(s),u=null;if(t.get(z))u=o.attr(m);else{var a=o.one(b);a&&(u=a.attr(I))}return n.sub(it,{src:u})},_getInfoTemplate:function(e){var t,n=this,r=n.get(A),i=n.get(D);return i?t=n.get(P):r&&(t=n.get(O)),$(ut.superclass._getInfoTemplate.apply(this,arguments),t)},_afterVisibleChange:function(e){var t=this;ut.superclass._afterVisibleChange.apply(this,arguments),e.newVal&&t.get(u)&&t.play()},_onPausedChange:function(e){var t=this;e.newVal&&t._cancelTimer()},_onPlayingChange:function(e){var t=this;e.newVal&&t._startTimer()}}});e.ImageGallery=ut},"2.0.0",{requires:["aui-image-viewer-base","aui-pagination","aui-toolbar"],skinnable:!0});
