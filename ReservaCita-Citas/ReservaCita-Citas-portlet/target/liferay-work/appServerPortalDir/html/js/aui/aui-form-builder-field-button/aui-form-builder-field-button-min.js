YUI.add("aui-form-builder-field-button",function(e,t){var n=e.Lang,r=e.Escape,i=e.cached(function(e){return e.substring(0,1).toUpperCase()+e.substring(1)}),s="btn",o="button",u="buttonType",a="form-builder-button-field",f="form-builder-field",l="id",c="label",t="name",h="node",p="predefinedValue",d="reset",v=" ",m="submit",g="template",y="templateNode",b="type",w=e.getClassName,E=w(s),S=w(f),x=w(f,h),T='<button id="{id}" class="'+[x,E].join(v)+'" type="{type}">{value}</button>',N=[m,d,o],C=e.Component.create({NAME:a,ATTRS:{acceptChildren:{readOnly:!0,value:!1},buttonType:{validator:function(t){return e.Array(N).indexOf(t.toLowerCase())>-1},value:m},predefinedValue:{value:i(m)},showLabel:{value:!1},template:{valueFn:function(){return T}}},UI_ATTRS:e.FormBuilderField.UI_ATTRS.concat([u]),CSS_PREFIX:S,EXTENDS:e.FormBuilderField,prototype:{getHTML:function(){var e=this;return n.sub(e.get(g),{id:r.html(e.get(l)),label:r.html(e.get(c)),name:r.html(e.get(t)),type:r.html(e.get(u)),value:r.html(e.get(p))})},getPropertyModel:function(){var t=this,n=t.getStrings(),r=e.FormBuilderButtonField.superclass.getPropertyModel.apply(t,arguments);return r.push({attributeName:u,editor:new e.RadioCellEditor({options:{button:n[o],reset:n[d],submit:n[m]}}),name:n[u]}),r},_uiSetButtonType:function(e){var t=this,n=t.get(y);n.setAttribute(b,e)},_uiSetPredefinedValue:function(e){var t=this,n=t.get(y);n.setContent(r.html(e))}}});e.FormBuilderButtonField=C,e.FormBuilder.types.button=e.FormBuilderButtonField},"2.0.0",{requires:["aui-form-builder-field-base"]});