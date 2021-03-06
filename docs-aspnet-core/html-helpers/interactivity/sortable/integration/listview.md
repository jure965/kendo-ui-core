---
title: ListView
page_title: ListView Integration | Telerik UI Sortable HtmlHelper for ASP.NET Core
description: "Learn how to reorder ListView items when using the Telerik UI Sortable HtmlHelper for ASP.NET Core."
slug: sortable_aspnetcore_integration_listview
position: 2
---

# ListView Integration

You can use the [Telerik UI Sortable HtmlHelper for ASP.NET Core](https://demos.telerik.com/aspnet-core/sortable/index) to reorder the items in a ListView by dragging and dropping.

## Prerequisites

* [Overview of the Telerik UI Sortable HtmlHelper for ASP.NET Core]({% slug htmlhelpers_sortable_aspnetcore %})
* [Overview of the Telerik UI ListView HtmlHelper for ASP.NET Core]({% slug htmlhelpers_listview_aspnetcore %})

## Reordering of Sortable Items

The Sortable reorders the HTML DOM elements. It does not automatically update the order of the items in the DataSource. This means that you have to explicitly implement the desired behavior.

## Reordering of ListView Items

To reorder the items of the ListView, initialize the Sortable on the ListView element. Normally, the `filter` property selects all elements that are direct children of the ListView element, for example, `.filter(">div")`.

## Reordering in Editable ListViews

If the editing functionality of the ListView is enabled, use a more specific filter selector that excludes the item which is currently in editing mode, for example, `.filter(">div:not(.k-edit-item)"`. In this way, the Sortable functionality will not interfere with the editing feature of the ListView.

To reorder the data items of the ListView, use the [approach for reordering the Grid data items]({% slug sortable_aspnetcore_integration_grid %}#reordering-of-grid-table-rows). For more information on the Sortable events, refer to the [Sortable server-side API](/api/sortable#eventssystemactionkendomvcuifluentsortableeventbuilder).

## See Also

* [Reordering of Grid and DataSource Data Items]({% slug sortable_aspnetcore_integration_grid %})
* [Server-side API](/api/sortable)
